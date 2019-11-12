package com.iwec.airplane.file.menager.map;

import java.util.Map;

public interface ReaderMap<K,V> {
	public Map<K,V> read(String file);
}
