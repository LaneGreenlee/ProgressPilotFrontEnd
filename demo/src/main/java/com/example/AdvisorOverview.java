package com.example;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class AdvisorOverview {

    @FXML
    private TextArea notesTextArea;

        @FXML
        private VBox vbox;

        @FXML
        private Text outputText;

        @FXML
        private VBox vbox2;

        @FXML
        private Text courseToTake;

        @FXML
        public void initialize() {
            Map<String, String> textMap = new HashMap<>();
            textMap.put("key1", "Hello");
            textMap.put("key2", "World");
            textMap.put("key3", "Hello World");
            textMap.put("key4", "Hello World");
            textMap.put("key5", "Hello World");
            textMap.put("key6", "Hello");
            textMap.put("key7", "World");
            textMap.put("key8", "Hello World");
            textMap.put("key9", "Hello World");
            textMap.put("key10", "Hello World");
            textMap.put("key11", "Hello");
            textMap.put("key12", "World");
            textMap.put("key13", "Hello World");
            textMap.put("key14", "Hello World");
            textMap.put("key15", "Hello World");
            textMap.put("key16", "Hello");
            textMap.put("key17", "World");
            textMap.put("key18", "Hello World");
            textMap.put("key19", "Hello World");
            textMap.put("key20", "Hello World");
            textMap.put("key21", "Hello");
            textMap.put("key22", "World");
            textMap.put("key23", "Hello World");
            textMap.put("key24", "Hello World");
            textMap.put("key25", "Hello World");


            // StringBuilder to accumulate the text to display
            StringBuilder stringBuilder = new StringBuilder();

            // Iterate over the HashMap entries and append key-value pairs to the StringBuilder
            for (Map.Entry<String, String> entry : textMap.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                stringBuilder.append("\n").append("\t Class: ").append(key).append("\t Grade: ").append(value);
            }

            // Set the accumulated text to the Text element
            outputText.setText(stringBuilder.toString());
            courseToTake.setText(stringBuilder.toString());

        }

    private void handleInput() {
        String notes = notesTextArea.getText();
        System.out.println(notes);
    }

    @FXML
    private void addNote() throws IOException {
        handleInput();
        // TODO: Add your logic here for user sign-up
    }
    }

