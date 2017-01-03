package cn.sc.java.io;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

public class FilterByHidden implements FileFilter {

	@Override
	public boolean accept(File pathname) {
		// TODO Auto-generated method stub
		return pathname.isHidden();
	}

	 

}
