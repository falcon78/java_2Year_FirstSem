public class SampleFlyingObject {
    public static void main(String[] args) {
        Boeing787 aPlane = new Boeing787();
        Swallow aBird = new Swallow();

        aPlane.fly();
        aBird.fly();
        aBird.pick(); // ���ιԤ��դ��ä���ȥ��顼�ˤʤ�
    }
}


