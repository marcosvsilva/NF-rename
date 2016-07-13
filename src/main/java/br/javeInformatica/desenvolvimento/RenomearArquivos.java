package br.javeInformatica.desenvolvimento;

import java.io.File;

/**
 * Created by Marcos on 13/07/2016.
 */
public class RenomearArquivos
{
    private static String caminhoExecucao;
    private static final String extensao = ".xml";
    private static int inicioNumeroNota = 28;
    private static int finalNumeroNota = inicioNumeroNota + 6;

    public static void main(String[] args)
    {
        File caminho = new File(".");
        caminhoExecucao = caminho.getAbsolutePath();
        File arquivos[] = caminho.listFiles();

        try
        {
            for (File arquivo: arquivos)
            {
                String nameArquivo = arquivo.getName();
                if (nameArquivo.substring(nameArquivo.indexOf('.'),nameArquivo.length()).equals(extensao))
                {
                    String nameNew = nameArquivo.substring(inicioNumeroNota,finalNumeroNota) + "nf" + extensao;
                    File arquivoNew = new File(nameNew);
                    arquivo.renameTo(arquivoNew);
                }
            }
        } catch (StringIndexOutOfBoundsException e) {}
    }
}
