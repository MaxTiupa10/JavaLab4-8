package ua.Lab.Composition;



import  ua.Lab.Collection.Collection;


import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MusicLibrary extends Collection {
    public MusicLibrary() {

    }

    public void  addData(){
        tracks = new ArrayList<>(Arrays.asList(
                new Track("Пісня 1", 192, 2020, "Джаз", "Ілля Найда"),
                new Track("Пісня 2", 180, 2019, "Рок", "Виконавець 2"),
                new Track("Пісня 3", 210, 2021, "Поп", "Виконавець 3"),
                new Track("Пісня 4", 200, 2018, "Реп", "Виконавець 4"),
                new Track("Пісня 5", 220, 2017, "Класика", "Виконавець 5"),
                new Track("Пісня 6", 192, 2016, "Рок", "Виконавець 6"),
                new Track("Пісня 7", 180, 2015, "Поп", "Виконавець 7"),
                new Track("Пісня 8", 210, 2014, "Джаз", "Виконавець 8"),
                new Track("Пісня 9", 192, 2013, "Реп", "Виконавець 9"),
                new Track("Пісня 10", 180, 2012, "Поп", "Виконавець 10"),
                new Track("Пісня 11", 210, 2011, "Джаз", "Виконавець 11"),
                new Track("Пісня 12", 192, 2010, "Рок", "Виконавець 12"),
                new Track("Пісня 13", 180, 2009, "Класика", "Виконавець 13"),
                new Track("Пісня 14", 210, 2008, "Реп", "Виконавець 14"),
                new Track("Пісня 15", 192, 2007, "Поп", "Виконавець 15"),
                new Track("Пісня 16", 180, 2006, "Джаз", "Виконавець 16"),
                new Track("Пісня 17", 210, 2005, "Рок", "Виконавець 17"),
                new Track("Пісня 18", 192, 2004, "Поп", "Виконавець 18"),
                new Track("Пісня 19", 180, 2003, "Реп", "Виконавець 19"),
                new Track("Пісня 20", 210, 2002, "Класика", "Виконавець 20"),
                new Track("Пісня 21", 192, 2020, "Джаз", "Ілля Найда"),
                new Track("Пісня 22", 180, 2019, "Рок", "Виконавець 22"),
                new Track("Пісня 23", 210, 2021, "Поп", "Виконавець 23"),
                new Track("Пісня 24", 200, 2018, "Реп", "Виконавець 24"),
                new Track("Пісня 25", 220, 2017, "Класика", "Виконавець 25"),
                new Track("Пісня 26", 192, 2016, "Рок", "Виконавець 26"),
                new Track("Пісня 27", 180, 2015, "Поп", "Виконавець 27"),
                new Track("Пісня 28", 210, 2014, "Джаз", "Виконавець 28"),
                new Track("Пісня 29", 192, 2013, "Реп", "Виконавець 29"),
                new Track("Пісня 30", 180, 2012, "Поп", "Виконавець 30"),
                new Track("Пісня 31", 210, 2011, "Джаз", "Виконавець 31"),
                new Track("Пісня 32", 192, 2010, "Рок", "Виконавець 32"),
                new Track("Пісня 33", 180, 2009, "Класика", "Виконавець 33"),
                new Track("Пісня 34", 210, 2008, "Реп", "Виконавець 34"),
                new Track("Пісня 35", 192, 2007, "Поп", "Виконавець 35"),
                new Track("Пісня 36", 180, 2006, "Джаз", "Виконавець 36"),
                new Track("Пісня 37", 210, 2005, "Рок", "Виконавець 37"),
                new Track("Пісня 38", 192, 2004, "Поп", "Виконавець 38"),
                new Track("Пісня 39", 180, 2003, "Реп", "Виконавець 39"),
                new Track("Пісня 40", 210, 2002, "Класика", "Виконавець 40"),
                new Track("Пісня 41", 192, 2020, "Джаз", "Ілля Найда"),
                new Track("Пісня 42", 180, 2019, "Рок", "Виконавець 42"),
                new Track("Пісня 43", 210, 2021, "Поп", "Виконавець 43"),
                new Track("Пісня 44", 200, 2018, "Реп", "Виконавець 44"),
                new Track("Пісня 45", 220, 2017, "Класика", "Виконавець 45"),
                new Track("Пісня 46", 192, 2016, "Рок", "Виконавець 46"),
                new Track("Пісня 47", 180, 2015, "Поп", "Виконавець 47"),
                new Track("Пісня 48", 210, 2014, "Джаз", "Виконавець 48"),
                new Track("Пісня 49", 192, 2013, "Реп", "Виконавець 49"),
                new Track("Пісня 50", 180, 2012, "Поп", "Виконавець 50")
        ));
    }
    public  List<Track> getLibrary() {return tracks;}

    public  void readFromFile(String filePath) {
        try {
            File file = new File(filePath);
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;

            while ((line = reader.readLine()) != null) {

                String[] data = line.split(",");

                if (data.length == 5) { // Перевірка на відповідність формату
                    String name = data[0].trim();
                    int duration = Integer.parseInt(data[1].trim());
                    int releaseDate = Integer.parseInt(data[2].trim());
                    String genre = data[3].trim();
                    String singer = data[4].trim();

                    // Створення нового об'єкта Track і додавання його до списку library
                    Track track = new Track(name, duration, releaseDate, genre, singer);
                    tracks.add(track);
                }
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void print() {
        System.out.println("Music Library : ");
        for (Track track : tracks) {
            System.out.println(track.toString());
        }
    }
    public  void durationDiapason() {
        while(true) {
            System.out.println("Введіть діапазон тривалості пісні : ");
            Scanner scanner = new Scanner(System.in);
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            if(format(x,y)) {
                List<Track> filteredTracks = filter(x,y);
                for (Track track : filteredTracks) {
                    System.out.println(track.toString());
                }
                break;
            }
        }
    }

    public boolean format(int x, int y){
        if (x <= y && x >= 0 && y >= 1)
            return true;
        else System.out.println("Неправильний формат введення даних. Приклад - 190 205.");
        return false;
    }
    public List<Track> filter(int x ,int y) {
            List<Track> filteredTracks = tracks.stream()
                    .filter(track -> track.getDuration() >= x && track.getDuration() <= y)
                    .toList();
            return filteredTracks;
    }
}

