package com.gdx.game.audio;

import com.badlogic.gdx.audio.Music;

public class Mp4ToMp3Adapter extends AudioManager {

    private Mp4Player mp4Player;

    public Mp4ToMp3Adapter() {
        super();
        mp4Player = new Mp4Player();
    }

    @Override
    public void onNotify(AudioCommand command, AudioTypeEvent event) {
        switch (command) {
            case MUSIC_LOAD:
                mp4Player.loadMp4(event.getValue());
                break;
            case MUSIC_PLAY_ONCE:
                Music music = mp4Player.playMp4(event.getValue(), false);
                setCurrentMusic(music);
                break;
            case MUSIC_PLAY_LOOP:
                Music musicLoop = mp4Player.playMp4(event.getValue(), true);
                setCurrentMusic(musicLoop);
                break;
            case MUSIC_STOP:
                mp4Player.stopMp4();
                break;
            case MUSIC_STOP_ALL:
                mp4Player.stopAllMp4();
                break;
            default:
                break;
        }
    }
}
