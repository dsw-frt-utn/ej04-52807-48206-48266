package app;

import data.Persistencia;
import views.MenuPrincipal;

public class Program {

    public static void main(String[] args) {

        Persistencia.inicializar();

        new MenuPrincipal().setVisible(true);
    }
}