package com.example.musicapp2;

public class Music {
    private int imageLogo;
    private String nameOfSong;
    private String nameofSinger;
    private String url;

    public Music(int imageLogo,String nameofSong,String nameofSinger,String url){
        this.imageLogo=imageLogo;
        this.nameofSinger=nameofSinger;
        this.nameOfSong=nameofSong;
        this.url=url;
    }

    public int getImageLogo() {
        return imageLogo;
    }

    public void setImageLogo(int imageLogo) {
        this.imageLogo = imageLogo;
    }

    public String getNameOfSong() {
        return nameOfSong;
    }

    public void setNameOfSong(String nameOfSong) {
        this.nameOfSong = nameOfSong;
    }

    public String getNameofSinger() {
        return nameofSinger;
    }

    public void setNameofSinger(String nameofSinger) {
        this.nameofSinger = nameofSinger;
    }


    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
