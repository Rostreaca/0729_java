package com.kh.practice.list.music.controller;

import java.util.ArrayList;
import java.util.List;

import com.kh.practice.list.music.model.vo.Music;

public class MusicController {

	private List list = new ArrayList();

	public int addList(Music music) {

		if (list.size() == 0) {
			list.add(music);
			return 1;
		}

		for (int i = 0; i < list.size(); i++) {
			Music m = (Music) list.get(i);
			if (m.getTitle().equals(music.getTitle()) || list.get(i).equals(music)) {
				return 0;
			}
		}

		list.add(music);
		return 1;
	}

	public int addAtZero(Music music) {

		if (list.size() == 0) {
			list.add(0, music);
			return 1;
		}

		for (int i = 0; i < list.size(); i++) {
			Music m = (Music) list.get(i);
			if (m.getTitle().equals(music.getTitle()) || list.get(i).equals(music)) {
				return 0;
			}
		}
		list.add(0, music);

		return 1;
	}

	public List printAll() {

		return list;

	}

	public Music searchMusic(String title) {

		for (int i = 0; i < list.size(); i++) {
			Music music = (Music) list.get(i);
			if (music.getTitle().equals(title)) {
				return music;
			}
		}

		return null;
	}

	public Music removeMusic(String title) {

		for (int i = 0; i < list.size(); i++) {
			Music remove = (Music) list.get(i);
			if (remove.getTitle().equals(title)) {
				list.remove(i);
				return remove;
			}

		}

		return null;
	}

	public Music setMusic(String title, Music music) {

		for (int i = 0; i < list.size(); i++) {
			Music m = (Music) list.get(i);
			if (m.getTitle().equals(music.getTitle())&&m.getSinger().equals(music.getSinger())) {
				m.setTitle(title);
				return m;
			}
		}

		return null;
	}

	
	
	public int ascTitle() {
		
		return 1;
	}

	public int descSinger() {

		return 1;
	}

}
