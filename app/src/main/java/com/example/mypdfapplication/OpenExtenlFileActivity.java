package com.example.mypdfapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;


public class OpenExtenlFileActivity extends AppCompatActivity {
    private PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_open_extenl_file);
        pdfView = findViewById(R.id.pdfView);

        // Handle the PDF file
        Uri fileUri = getIntent().getData();
        if (fileUri != null) {
            displayPDF(fileUri);
        }
    }
    private void displayPDF(Uri fileUri) {
        // Load and display the PDF using PDFView or your preferred PDF viewing library
        pdfView.fromUri(fileUri)
                .defaultPage(0)
                .load();
    }
}



