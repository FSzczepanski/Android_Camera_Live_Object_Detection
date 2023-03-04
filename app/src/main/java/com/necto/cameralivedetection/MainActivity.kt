package com.necto.cameralivedetection

import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.google.mlkit.vision.common.InputImage
import com.google.mlkit.vision.objects.ObjectDetection
import com.google.mlkit.vision.objects.ObjectDetector
import com.google.mlkit.vision.objects.defaults.ObjectDetectorOptions

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val objectDetector = configureAndroidObjectDetector();



       /* val image = InputImage.fromBitmap(Bitmap., 0)
        objectDetector.process(image)
            .addOnSuccessListener { detectedObject ->
                val label = detectedObject.first().labels.first().text;
                Log.e("jest", label);
            }
            .addOnFailureListener{ e ->
            Log.e("error", e.message.toString());
            }*/

    }

    private fun configureCameraListener(){

    }

    private fun configureAndroidObjectDetector(): ObjectDetector {
        val options= ObjectDetectorOptions.Builder()
            .setDetectorMode(ObjectDetectorOptions.STREAM_MODE)
            .enableClassification()
            .build();

        val objectDetector = ObjectDetection.getClient(options);
        return objectDetector;
    }


}