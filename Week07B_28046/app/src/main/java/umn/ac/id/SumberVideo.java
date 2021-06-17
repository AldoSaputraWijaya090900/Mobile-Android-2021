package umn.ac.id;

import android.net.Uri;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.VideoView;
import java.io.Serializable;

public class SumberVideo implements Serializable {
    private String judul;
    private String keterangan;
    private String videoURI;
    public SumberVideo(String judul, String keterangan,
                       String videoURI) {
        this.judul = judul;
        this.keterangan = keterangan;
        this.videoURI = videoURI;
    }

    public String getJudul()        { return this.judul;        }
    public String getKeterangan()   { return this.keterangan;   }
    public String getVideoURI()     { return this.videoURI;     }

    public void setJudul (String judul){ this.judul = judul;    }
    public void setKeterangan (String keterangan) {
        this.keterangan = keterangan;
    }
    public void setVideoURI(String videoURI) {
        this.videoURI = videoURI;
    }
    public String toString() {
        return this.getJudul()+" => "+ this.getKeterangan(); }
}