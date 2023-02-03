package com.enchere.appli.main;

import com.enchere.appli.accesBase.Connexion;
import com.enchere.appli.dao.RencherirDAO;
import com.enchere.appli.model.Rencherir;

import java.sql.Timestamp;

public class main
{
    public static void main(String[] args) throws Exception
    {
        Rencherir r = RencherirDAO.createRencherireForTest(1,1,2000, Timestamp.valueOf("2023-02-01 07:56:00"),Connexion.connect());
        System.out.println(r.toString());
    }
}
