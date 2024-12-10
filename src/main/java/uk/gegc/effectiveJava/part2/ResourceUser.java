package uk.gegc.effectiveJava.part2;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;

/*
Task: Create a ResourceUser class that opens a file for reading and processes
its lines using try-with-resources. For testing, create a dummy resource
(e.g., StringReader) to check that the class works correctly without a real file.*/
public class ResourceUser {
    private final BufferedReader reader;

    public ResourceUser(Reader reader){
        this.reader = new BufferedReader(reader);
    }

    public void processLines() throws IOException{
        try(BufferedReader r = this.reader){
            String line;
            while ((line = r.readLine()) != null) {
                System.out.println(line);
            }
        }
    }
}
