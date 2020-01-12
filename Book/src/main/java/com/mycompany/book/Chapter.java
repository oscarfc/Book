/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.book;

import java.util.Objects;

/**
 *
 * @author oscar.favero
 */
public class Chapter {

    private final String chapterName;
    private final String chapterContent;

    public Chapter(String chapterName, String chapterContent) {
        this.chapterName = chapterName;
        this.chapterContent = chapterContent;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + Objects.hashCode(this.chapterName);
        hash = 59 * hash + Objects.hashCode(this.chapterContent);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Chapter other = (Chapter) obj;
        if (!Objects.equals(this.chapterName, other.chapterName)) {
            return false;
        }
        if (!Objects.equals(this.chapterContent, other.chapterContent)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Chapter{" + ", chapterName=" + chapterName + ", chapterContent=" + chapterContent + '}';
    }

    public String getChapterName() {
        return chapterName;
    }

    public String getChapterContent() {
        return chapterContent;
    }
}
