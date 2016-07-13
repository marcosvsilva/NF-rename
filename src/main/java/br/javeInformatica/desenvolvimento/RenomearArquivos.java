package br.javeInformatica.desenvolvimento;

import java.io.File;

/**
 * Created by Marcos on 13/07/2016.
 */
public class RenomearArquivos
{
    private static String caminhoExecucao;

    public static void main(String[] args)
    {
        File caminho = new File(".");
        File arquivos[] = caminho.listFiles();

        for (int i = 0; i < arquivos.length; i++)
        {
            System.out.println(arquivos[i].getName());
        }
    }
}
