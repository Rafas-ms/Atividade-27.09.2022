/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade01;

public class Numero {

    public long somaRecursiva(long n) {
        if (n == 0)
            return 0;
        else
            return n + somaRecursiva(n - 1);
    }
}