package com.gdx.game.audio;

import com.badlogic.gdx.audio.Music;
import com.gdx.game.manager.PreferenceManager;
import com.gdx.game.manager.ResourceManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Hashtable;

public class Mp4Player {

    private static final Logger LOGGER = LoggerFactory.getLogger(Mp4Player.class);

    private Hashtable<String, Music> queuedMp4Music;

    public Mp4Player() {
        queuedMp4Music = new Hashtable<>();
    }

    public void loadMp4(String filePath) {
        ResourceManager.loadMusicAsset(filePath);
    }

    public Music playMp4(String filePath, boolean isLooping) {
        Music music = queuedMp4Music.get(filePath);

        if (music != null) {
            music.setLooping(isLooping);
            music.setVolume(PreferenceManager.getMusicVolume());
            checkMusicEnabled(music);
        } else if (ResourceManager.isAssetLoaded(filePath)) {
            music = ResourceManager.getMusicAsset(filePath);
            music.setLooping(isLooping);
            music.setVolume(PreferenceManager.getMusicVolume());
            checkMusicEnabled(music);
            queuedMp4Music.put(filePath, music);
        } else {
            LOGGER.debug("Mp4 music not loaded");
        }

        return music;
    }

    public void stopMp4() {
        for (Music music : queuedMp4Music.values()) {
            music.stop();
        }
    }

    public void stopAllMp4() {
        for (Music music : queuedMp4Music.values()) {
            music.stop();
        }
    }

    private void checkMusicEnabled(Music music) {
        if (!PreferenceManager.getInstance().isMusicEnabled()) {
            music.stop();
        } else {
            music.play();
        }
    }

    public void dispose() {
        for (Music music : queuedMp4Music.values()) {
            music.dispose();
        }
    }
}
