package com.refactoring.chaptor01;

/**
 * 租赁
 */
public class Rental {
    private Movie _movie;//电影
    private int _daysRented;//租赁天数

    public Rental(Movie movie, int daysRented) {
        _movie = movie;
        _daysRented = daysRented;
    }

    public int getDaysRented() {
        return _daysRented;
    }

    public Movie getMovie() {
        return _movie;
    }


    /**
     * 积分计算
     *
     * @return
     */
    public int getFrequentRenterPoints() {
        return _movie.getFrequentRenterPoints(_daysRented);
    }

    public double getCharge() {
        return _movie.getCharge(_daysRented);
    }
}
