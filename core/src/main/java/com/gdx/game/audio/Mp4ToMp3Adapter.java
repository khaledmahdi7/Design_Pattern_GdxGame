package com.gdx.game.audio;

import com.gdx.game.audio.AudioManager;
import com.gdx.game.audio.AudioObserver;
import com.gdx.game.audio.AudioSubject;

public class Mp4ToMp3Adapter extends AudioManager implements AudioObserver {

    private Mp4Player mp4Player;

    public Mp4ToMp3Adapter(AudioSubject audioSubject) {
        super();
        audioSubject.addObserver(this);
        mp4Player = new Mp4Player();
    }

    @Override
    public void onNotify(AudioCommand command, AudioTypeEvent event) {
        if (command == AudioCommand.MUSIC_PLAY_ONCE || command == AudioCommand.MUSIC_PLAY_LOOP) {
            String mp4FilePath = event.getValue().replace(".mp3", ".mp4");
            String mp3FilePath = event.getValue().replace(".mp4", "_converted.mp3");

            // Convertir le fichier MP4 en MP3
            Mp4ToMp3Converter.convertMp4ToMp3(mp4FilePath, mp3FilePath);

            // Lire le fichier MP3 converti avec AudioManager
            super.onNotify(command, AudioTypeEvent.NONE);
        } else {
            super.onNotify(command, event);
        }
    }
}
