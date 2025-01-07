package homework.abstract01;

public class Runner {
    public static void main(String[] args) {
       /* 1- name field ı ve  default  constructorı olan Sekil isimli bir Abstract Class create ediniz.
        2- Bu classın alan() ve cevre() abstract metodları ve içinde Alan ve cevre nin sonucu olan toString cocrete metodu,
        sekilin adını veren getName concrete metodu ve ciz() isimli concrete metodlarını create ediniz.
        3- Bu Classı extend eden child  Dikdörtgen ve Cember isimli 2 class create ediniz.
        4- runner classda meth run ediniz */
        Sekil dikdortgen = new Dikdörtgen("Dikdörtgen", 5, 3);
        System.out.println(dikdortgen.toString());
        dikdortgen.ciz();

        // Çember Nesnesi
        Sekil cember = new Cember("Çember", 4);
        System.out.println(cember.toString());
        cember.ciz();
    }





    }

