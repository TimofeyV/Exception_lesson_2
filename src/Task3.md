1. В строке метода main можно явно не указывать <i>trows Exception</i>
2. Блок кода <i>catch (Throwable ex)</i>, нужно расположить после всех блоков catch
3. Необходимо добавить блок <i>catch (ArithmeticException ex)</i>, т.к. происходит работа с числами