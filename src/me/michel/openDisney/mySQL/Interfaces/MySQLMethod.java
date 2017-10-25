package me.michel.openDisney.mySQL.Interfaces;

import me.michel.openDisney.mySQL.Methods.Data;

public interface MySQLMethod {

    void setup();

    void execute(Data data);
}
