package com.piotrek.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//@Component
public class FileFortuneService implements FortuneService {

    private String fileName;
    private List<String> fortunes;
    private Random random = new Random();

    @Autowired
    public FileFortuneService(@Value("${fortunes.fileName}") String _fileName) {
        fileName = _fileName;
    }

    @PostConstruct
    public void readFortunes() {
        fortunes = new ArrayList<>();

        File file = new File(fileName);

        try(BufferedReader br = new BufferedReader(new FileReader(file))) {
            String fortune;
            while ((fortune = br.readLine()) != null) {
                fortunes.add(fortune);
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String getFortune() {
        int index = random.nextInt(fortunes.size());
        return fortunes.get(index);
    }

}
