package ch07;

public class CellPhoneDmbExam
{

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        CellPhoneDmb dmbCellPhone = new CellPhoneDmb("자바폰", "검정", 10);
        System.out.println("모델 : " + dmbCellPhone.model);
        System.out.println("색상 : " + dmbCellPhone.color);
        System.out.println("채널 : " + dmbCellPhone.channel);

        dmbCellPhone.powerOn();
        dmbCellPhone.bell();
        dmbCellPhone.sendVoice("여보세요");
        dmbCellPhone.receiveVoice("안녕하세요 저는 홍길동");
        dmbCellPhone.sendVoice("반갑습니다");
        dmbCellPhone.hangUp();
        dmbCellPhone.turnOnDmb();
        dmbCellPhone.changeChannelDmb(20);;
        dmbCellPhone.turnOffDmb();
    }

}
