package lesson_23_MyList;
/*
@ date 17.06.2024
@ author Alla Novytska

 */

    public class GenericMyList<T> {


        private T value;

        public GenericMyList(T value) {
            this.value = value;
        }
        public T getValue() {
            return value;
        }
        public void setValue(T value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "MyList{" +
                    "value=" + value +
                    '}';



        }

        }








