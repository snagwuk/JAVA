package ch07;

public class CellPhoneDmbExam
{

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        CellPhoneDmb dmbCellPhone = new CellPhoneDmb("�ڹ���", "����", 10);
        System.out.println("�� : " + dmbCellPhone.model);
        System.out.println("���� : " + dmbCellPhone.color);
        System.out.println("ä�� : " + dmbCellPhone.channel);

        dmbCellPhone.powerOn();
        dmbCellPhone.bell();
        dmbCellPhone.sendVoice("��������");
        dmbCellPhone.receiveVoice("�ȳ��ϼ��� ���� ȫ�浿");
        dmbCellPhone.sendVoice("�ݰ����ϴ�");
        dmbCellPhone.hangUp();
        dmbCellPhone.turnOnDmb();
        dmbCellPhone.changeChannelDmb(20);;
        dmbCellPhone.turnOffDmb();
    }

}
