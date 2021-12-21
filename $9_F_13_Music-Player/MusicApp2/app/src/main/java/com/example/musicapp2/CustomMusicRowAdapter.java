package com.example.musicapp2;


import android.content.Intent;
import android.media.MediaPlayer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;

import java.io.IOException;

public class CustomMusicRowAdapter extends RecyclerView.Adapter<CustomMusicRowAdapter.ViewHolder> {

    private Music[] localDataSet;
    private MediaPlayer mediaPlayer;

    public CustomMusicRowAdapter(Music[] localDataSet) {
        this.localDataSet = localDataSet;
    }

    /**
     * Provide a reference to the type of views that you are using
     * (custom ViewHolder).
     */
    public static class ViewHolder extends RecyclerView.ViewHolder {
        private final ImageView imageLogo;
        private final TextView song;
        private final TextView artist;

        public ViewHolder(View view) {
            super(view);
            // Define click listener for the ViewHolder's View

            imageLogo = (ImageView)view.findViewById(R.id.songImage);
            song= (TextView) view.findViewById(R.id.song);
            artist=(TextView) view.findViewById(R.id.artist);
        }

        public ImageView getImageLogo() {
            return imageLogo;
        }

        public TextView getSong() {
            return song;
        }

        public TextView getArtist() {
            return artist;
        }


    }
//
//    /**
//     * Initialize the dataset of the Adapter.
//     *
//     * @param dataSet String[] containing the data to populate views to be used
//     * by RecyclerView.
//     */
//    CustomMusicRowAdapterAdapter(Music[] dataSet) {
//        localDataSet = dataSet;
//    }

    // Create new views (invoked by the layout manager)
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        // Create a new view, which defines the UI of the list item
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.music_row, viewGroup, false);

        return new ViewHolder(view);
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(ViewHolder viewHolder, final int position) {

        // Get element from your dataset at this position and replace the
        // contents of the view with that element
        viewHolder.getArtist().setText(localDataSet[viewHolder.getAdapterPosition()].getNameofSinger());
        viewHolder.getSong().setText(localDataSet[viewHolder.getAdapterPosition()].getNameOfSong());
        viewHolder.getImageLogo().setImageResource(localDataSet[viewHolder.getAdapterPosition()].getImageLogo());

        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            String url;
            int image;
            @Override
            public void onClick(View view) {
//                url=localDataSet[viewHolder.getAdapterPosition()].getUrl();
//
//                mediaPlayer=new MediaPlayer();
//                mediaPlayer.setScreenOnWhilePlaying(true);
//
//                try {
//                    mediaPlayer.setDataSource(url);
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//                mediaPlayer.prepareAsync();
//
//                mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
//                    @Override
//                    public void onPrepared(MediaPlayer mediaPlayer) {
//                        Toast.makeText(view.getContext(), "Playing..."+localDataSet[viewHolder.getAdapterPosition()].getNameOfSong(), Toast.LENGTH_SHORT).show();
//                        mediaPlayer.start();
//                    }
//                });
                String EXTRA_KEY="songName";
                String EXTRA_IMAGE_RESOURCE="imageResource";

                url=localDataSet[viewHolder.getAdapterPosition()].getUrl();
                image=localDataSet[viewHolder.getAdapterPosition()].getImageLogo();

                Intent intent =new Intent(view.getContext(),PlayingSong.class);
                intent.putExtra(EXTRA_KEY,url);
                intent.putExtra(EXTRA_IMAGE_RESOURCE,image);
                view.getContext().startActivity(intent);
            }
        });
    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return localDataSet.length;
    }
}
