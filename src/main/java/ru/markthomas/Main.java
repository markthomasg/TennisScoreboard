package ru.markthomas;

import ru.markthomas.dao.PlayerDAO;
import ru.markthomas.model.Player;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        PlayerDAO dao = new PlayerDAO();
        List<Player> r = dao.findAll();
        int x;
    }
}
