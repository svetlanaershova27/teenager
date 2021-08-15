public class Person {

        public static boolean isTeenager(int age)  {
            boolean result;
            if (age <= 19 && age >= 13) {
                result = true;
                System.out.println(age + " is Teenager");
            } else {
                try {
                    if (age < 0) {
                        throw new IllegalArgumentException("Only Positive Numbers & no Letters Please!");
                    }
                } catch (IllegalArgumentException ex){
                    System.out.println(ex.getMessage());
                    //перехватываем, и, если не получилось,
                    // Сообщаем, что произошло
                } result = false;
                System.out.println( age +" is not teenager");
            }


            return result;
        }}

