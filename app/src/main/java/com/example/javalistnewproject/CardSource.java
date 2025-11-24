package com.example.javalistnewproject;

public interface CardSource {
    CardData getCardData(int position);
    int size();
}
