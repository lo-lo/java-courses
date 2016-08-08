public class Calculator  {

    //результат вычисления
    private int result;

    //суммируем аргументы
    public void add(int... params){
        for (Integer param: params){
            this.result+=param;
        }
    }

   //получаем результат вычисления
    public int getResult(){
        return this.result;
    }

    //очищаем результат вычисления
    public void cleanResult(){
        this.result = 0;
    }

}
