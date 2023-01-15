package com.interview.clevertiFeefo;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.text.similarity.LevenshteinDistance;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StringNormalizer {
    private static final List<String> defaultWords = List.of("Architect", "Software Engineer", "Quantity Surveyor", "Accountant");

    public String normalizeWords (String inputString){
        LevenshteinDistance levenshteinDistance = LevenshteinDistance.getDefaultInstance();

        double lowestRank = Double.MAX_VALUE;
        String normalizedWord = "";

        for(String word : defaultWords){
            double levenshteinRank = levenshteinDistance.apply(word, inputString).doubleValue() /
                    Math.max(word.length(), inputString.length());
            if(levenshteinRank < lowestRank){
                lowestRank = levenshteinRank;
                normalizedWord = word;
            }
        }

        return normalizedWord;
    }
}
