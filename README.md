# <h1>Java_Themes</h1></p>
В данном проекте по указанному пути: https://github.com/Krassilnikov-AV/JavaThemes/tree/master/src/main/java/ru/themes, распологаются приложения, в которых рассматриваются основные темы языка Java, такие как Java Core, Java Collection API и др., для более эффективной подготовки к собеседованию.</p> Описание проектов приложено ниже, которое добавлятся по мере добавления приложений.</p>
 _ _ _ _
_**Краткое описание приложений:**_</p>

- _AggregationAndComposition_ - рассматриваются начальные знания ООП: создание экземпляров класса, наследование, задание значений полей класса и основные приёмы ассоциации: агрегации и композиции и их описанием.</p>
-
_ _ _ _
  <h2>Описание тем на практике, используя приложения по представленной выше ссылке</h2></p>
 - <em>AggregationAndComposition⬇️</em> </p>
 
<h5>Объектно ориентированное программирование (ООП) - это методология программирования, основанная на представлении программного
продукта в виде совокупности объектов, каждый из которых является экземпляром
конкретного класса.</h5> ООП использует в качестве базовых элементов взаимодействие объектов.</p>
<em> Объект </em>- именнованная модель реальной сущности, обладающая конкретными значениями свойств и проявляющая свое поведение, обладающий именем набора данных (полей и свойств объекта), физически находящихся в памяти компьютера, и методов, имеющих доступ к ним. Объект -это конкретный экземпляр класса.</p>
<h3>Основные  понятия и определения:</h3></p>
<strong>Объектно-ориентированное программирование строится на 4-х основных принципах:</strong></p>
1. Наследование</p>
2. Инкапсуляция</p>
3. Полиморфизм</p>
4. Абстракция</p>
<strong>Наследование</strong> -  это процесс благодаря которому один объект может приобрести свойства другого объекта (наследование всех свойств одного объекта другим) и добавлять черты характерны только для него самого!</p>


 В приложении применено наследование, вызываемого объекта класса потомка будет зависит от класса родителя (пример вызова экземпляра класса Truck) </p>
 Особенности наследования:</p>
  - вызов экземпляров класса наследника через класс родитель;</p>
  - можно переопределять методы класса родителя или не переопределять;</p>
  - создавать свои методы класса, расширяя функционал класса родителя</p>
<strong>Главным преимуществом наследования, является ВОЗМОЖНОСТЬ ИСПОЛЬЗОВАНИЯ ПОВТОРНОГО КОДА. </strong>  </p>

Классы и объекты могут быть связаны друг с другом. Наследование описывает связь «является» (или по-английски «IS A»). В нашем примере класс Cabriolet является автомобилем, т.е. наследником класса Car. Такое отношение легко выразить с помощью наследования, где Car будет родительским классом, а Cabriolet — потомком.</p>
![потомок автомобиля](https://user-images.githubusercontent.com/61631173/127644064-d7653122-db54-4a50-aaaa-3cd70226f2de.JPG)
</p>

Однако не все связи отношения в мире описываются таким образом. К примеру, клавиатура определенно как-то связана с компьютером, но она не является компьютером. Руки как-то связаны с человеком, но они не являются человеком.</p>
В этих случаях в его основе лежит другой тип отношения: не «является», а «является частью» («HAS A»). Рука не является человеком, но является частью человека. Клавиатура не является компьютером, но является частью компьютера.</p>

Теоия ООП выделяет три основных отношения между классами:</p>
- Ассоциация;</p>
- Агрегация и композиция;</p>
- Обобщение/Расширение (наследование).</p>

Отношения _HAS A_ можно описать в коде, используя механизмы композиции и агрегирования. Разница между ними заключается в «строгости» этих связей.</p>
Агрегация и композиция на самом деле являются частными случаями ассоциации. Это более конкретизированные отношения между объектами.</p>
В приведйнном приложении, в частности рассматриваютсяслучаи ассоциации: композиции и агрегации. </p>
<strong> Ассоциация </strong> – это когда один класс включает в себя другой класс в качестве одного из полей. </p>
 <em> Ассоциация описывается словом «имеет» </em>. <em> Класс CarOwner, в приведённом примере включает в себя поле класса Car, что является прмером ассоциации </em> </p>
 Вполне естественно, что он не будет являться наследником двигателя (хотя такая архитектура тоже возможна в некоторых ситуациях). <p>
 Выделяют два частных случая ассоциации: <em>композиция</em> и <em>агрегация</em>. <p>
 <strong> Композиция: </strong> – это когда двигатель не существует отдельно от автомобиля. Он создается при создании автомобиля и полностью управляется автомобилем. </em>
  В приедённом примере, экземпляр двигателя <em> car </em> будет создаваться в конструкторе автомобиля - это и будет являться композицией. </p>
  Автомобиль имеет двигатель.</p>
 ![композиция](https://user-images.githubusercontent.com/61631173/127641647-d661e103-8498-44e9-ad53-a171ffb8b3ef.JPG)</p>
  <strong> При композиции связь между объектами жёсткая</strong>, т.е. время жизненного цикла, вхожящего объекта совпадает с временем жизни родительского объекта, что предсталено в проиллюстрированном примере выше, где в конструкторе родительского класса создаётся новый оббъект класса двигатель, в данном случае жизнь вновь сохданного объекта прекратится при прекращении жизни класса родителя.</p>
  
 <strong> Агрегация: </strong>   — это отношение когда один объект является частью другого, но объекты могут сцществоаоть отдельно друг от друга.
 Класс владельца авто можно рассмотреть как пример агрегации, т.к. в отличии от конкретного двигателя автовладелец может иметь несколько автомобилей, на поведение автомобиля данное отношение ни как не скажется, в таком случае связб между автовладельцем и автомобилем менее жёсткая.</p>
![ассоциация_агрегация](https://user-images.githubusercontent.com/61631173/127651933-b2ceed79-2b97-4cb4-bb61-f393437c9286.JPG)</p>
В представленной реализации можно наблюдать, что в конструкторе класса входным параметром является экземпляр класса автомобиль, т.е. данный объект уже создан и получает какое то значение. В этом случае при прекращении действия экземпляра класса автовладельца, экземпляр класса автомобиля продолжит своё существование.
