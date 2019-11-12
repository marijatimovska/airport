package com.iwec.airplane.file.menager.map;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public abstract class ReaderMapImpl<K, V> implements ReaderMap<K, V> {

	@Override
	public Map<K, V> read(String file) {
		Map<K, V> map = new HashMap<K,V>();
		try (BufferedReader br = new BufferedReader(new FileReader(new File(file)))) {
			String line;
			while ((line = br.readLine()) != null) {
				Map<K, V> t = createInstance(line);
				for (Entry<K,V> entry: t.entrySet()) {
					if(entry != null) {
						map.put(entry.getKey(), entry.getValue());
					}				
				}
			}
		} catch (IOException e) {
			System.err.println("Error while reading file" + file);
		}
		return map;
	}

	protected abstract Map<K, V> createInstance(String line);

}
