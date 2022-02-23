package itacademy.lsr.javalanguage.task02.n3e04;

public class Main {
    public static void main(String[] args) {
        boolean firstBool;
        boolean secondBool;
        // loop for test all possible states
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                if(i == 0){
                    firstBool = false;
                }else{
                    firstBool = true;
                }

                if(j == 0){
                    secondBool = false;
                }
                else{
                    secondBool = true;
                }

                System.out.println("Program start");
                System.out.println("Program state: " + firstBool + "/" + secondBool);
                try{

                    FailingConstructor fc = new FailingConstructor(123, firstBool, secondBool);
                    try{
                        System.out.println("do fc stuff");
                    }finally {
                        //only will dispose if constructed.
                        fc.dispose();
                    }
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                } finally {
                    System.out.println("Program end\n\n");
                }

            }
        }


    }
}

class FailingConstructor {
    int id;

    FailingConstructor(int id, boolean firstCleanUp, boolean secondCleanUp) throws Exception {
        //try to construct d1
        System.out.println("Failing Constructor Started");
        try{
            NeedCleanUp d1 = new NeedCleanUp(1, firstCleanUp);

            //try to do d1 stuff (construct d2)
            try{
                System.out.println("d1 stuff executed");
                NeedCleanUp d2 = new NeedCleanUp(2,secondCleanUp);

                //try to do d2 stuff
                try{
                    System.out.println("d2 stuff executed");
                }catch (Exception e){
                    System.out.println("d2 stuff exception");
                }finally {
                    this.id = id;
                    d2.dispose();
                }
            }catch (Exception e){
                throw e;
            }finally{
                d1.dispose();
            }

        }catch (Exception e) {
            throw e;
        }


    }

    void dispose(){
        System.out.println("FC " + id + " disposed!");
    }
}

class NeedCleanUp {
    int id;
    NeedCleanUp (int id, boolean isException) throws Exception{
        this.id = id;
        if (isException){
            throw new Exception("Constructor number " + id + " failed");
        }
    }
    void dispose(){
        System.out.println(id + " disposed!");
    }
}
