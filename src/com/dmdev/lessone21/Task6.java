package com.dmdev.lessone21;

/**
 * Задание 3
 * Программист Robert сразу после окончания курсов dmdev устроился в лучшую IT компанию мира на позицию Junior Java Developer с зарплатой 600$ в месяц.
 * Ему обещали, что будут поднимать зарплату на 400$ каждые 6 месяцев.
 * 300$ в месяц Ваня тратит на еду и развлечения.
 * 10% от зарплаты Ваня ежемесячно переводит на счет брокера, чтобы инвестировать в акции с доходностью 2% в месяц.
 * <p>
 * Посчитать, сколько Robert будет иметь средств на своем счету и на счету брокера за 3 года и 2 месяца.
 * <p>
 * Для интереса: попробовать увеличить процент, которые Ваня инвестирует из своей зарплаты
 */
public class Task6 {
    public static void main(String[] args) {
        double zp = 600;
        double zatrati = 300;
        double broker = 0.1;
        double procInvest = 0.02;
        int srok = 38;
        double rostZp = 400;
        System.out.println(getScoreVanya(zp, zatrati, broker, srok, rostZp));
        System.out.println(brokerSchet(zp,broker,procInvest, srok, rostZp));
    }

    public static double getScoreVanya(double zarplata, double trati, double procentBrokeru, int vremyaRaboti, double uvelZp) {
        double schetIvana = 0;
        for (int mes = 1; mes < vremyaRaboti; mes++) {
            schetIvana = schetIvana + (zarplata - (procentBrokeru * zarplata) - trati);
            if (mes % 6 == 0) {
                zarplata = zarplata + uvelZp;
            }
        }
        return schetIvana;
    }
 public  static double brokerSchet ( double zarplata, double procentBrokeru, double procInvest, int vremyaRaboti, double uvelZp) {
        double brokerSchet = 0;
     for (int mes = 1; mes < vremyaRaboti; mes++) {
         brokerSchet = brokerSchet + (procentBrokeru * zarplata) + procInvest * brokerSchet;
         if (mes % 6 == 0) {
             zarplata += uvelZp;
         }
     }
     return brokerSchet;
 }


}
