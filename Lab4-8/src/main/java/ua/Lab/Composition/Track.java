package ua.Lab.Composition;

import java.util.Scanner;

public class Track {
    private  String name;
    private  int duration;
    private  int releaseDate;
    private  String genre;
    private  String singer;

    public Track(String name, int duration, int releaseDate, String genre, String singer) {
        this.name = name;
        this.duration = duration;
        this.releaseDate = releaseDate;
        this.genre = genre;
        this.singer = singer;
    }

    public Track() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть назву пісні : ");
        name = scanner.nextLine();
        System.out.print("Введіть тривалість пісні в секундах : ");
        duration = scanner.nextInt();
        System.out.print("Введіть рік виходу пісні : ");
        releaseDate = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Введіть назву жанру пісні : ");
        genre = scanner.nextLine();
        System.out.print("Введіть назву автора пісні : ");
        singer = scanner.nextLine();
    }

    public String getGenre() {
        return genre;
    }

    public int getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return String.format("Track: %-12s | Singer: %-18s | Genre: %-8s | Duration: %-3s | Release Date: %4s",
                name, singer, genre,duration, releaseDate);
    }
}

