package ua.Lab.Disc;

import  ua.Lab.Composition.Track;
import  ua.Lab.Collection.Collection;

import java.io.*;
import java.util.*;

public class Disc extends Collection {

    public Disc() {
        tracks = new ArrayList<>();
    }

    public void addCollection(List<Track> tracks1) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            for (Track track : tracks1) {
                System.out.println(((tracks1.indexOf(track)) + 1) + "." + track.toString());
            }
            System.out.println("Виберіть пісню за номером , щоб завершити натисніть 0 : ");
            int buf = scanner.nextInt();
            if (buf <= 0 || buf > tracks1.size())
                break;
            if(tracks.contains(tracks1.get(buf - 1))) {
                System.out.println("Ти вже додав цю пісню в диск!");
                continue;
            }
            addTrack(tracks1.get(buf - 1));
        }
        System.out.println("Пісні збережені на диску : ");
        select();
        fileUpdate();
    }
    public void addTrack(Track track){
        tracks.add(track);
    }

    public void select() {
        for (Track track : tracks) {
            System.out.printf("%4d. %s%n", (tracks.indexOf(track)) + 1, track.toString());
        }
    }

    public void deleteComposition() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            for (Track track : tracks) {
                System.out.println(((tracks.indexOf(track)) + 1) + "." + track.toString());
            }
            System.out.println("Виберіть пісню за номером , щоб завершити натисніть 0 : ");
            int buf = scanner.nextInt();
            if (buf <= 0 || buf > tracks.size())
                break;
            deleteTrack(buf-1);
        }
        fileUpdate();
    }
    public void deleteTrack(int index){
        tracks.remove(index);
    }

    public void Sort() {
        styleSort();
        select();
        fileUpdate();
    }

    public void fileUpdate() {
        String filePath = "D:\\Прикладне програмування\\Disc.txt";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (Track track : tracks) {
                writer.append(String.format("%4d. %s%n", (tracks.indexOf(track)) + 1, track.toString()))
                        .append("\n");
            }
            System.out.println(" Дані успішно оновлені! ");
        } catch (IOException e) {
            System.err.println("Помилка при записі в файл: " + e.getMessage());
        }
    }

}
