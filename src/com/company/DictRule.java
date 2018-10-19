package com.company;

import java.io.*;

public class DictRule implements Rule{

    private String path;

    public DictRule(String dictFilePath) throws IOException {
        path = dictFilePath;
        File f = new File(path);
        if (!f.exists()){
            throw new IOException("File not found");
        }
    }

    @Override
    public boolean check(String pass){
        BufferedReader br;

        try {
            br = new BufferedReader(new FileReader(path));
            String line;
            while ((line = br.readLine()) != null){
                if (pass.contains(line.replace("\n", ""))){
                    return false;
                }
            }
        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }return true;

    }
}
