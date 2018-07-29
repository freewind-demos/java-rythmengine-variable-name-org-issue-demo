Java Rythm Variable Name `org` Issue Demo
=========================================

Found an issue of [rythmengine](https://github.com/rythmengine/rythmengine), it about the argument name, which can't be `org` if there is `@if` tag used.

Run `Hello.java` in your IDE, you will see such error:

```
Exception in thread "main" org.rythmengine.exception.CompileException: rythmengine cannot be resolved or is not a field

Template: src/main/resources/rythm/hello.rythm

Relevant template source lines:
-------------------------------------------------
   1: @args String org
   2: <div>
>> 3:     @if(3>2) {
   4:     <div>Good!</div>
   5:     }
   6: </div>


Relevant Java source lines:
-------------------------------------------------
   72:
   73: 	public org.rythmengine.utils.TextBuilder build(){
   74: 		buffer().ensureCapacity(71);
   75: p("<div>\n"); //line: 4
   76:
>> 77: if (org.rythmengine.utils.Eval.eval(3>2)) { //line: 3
   78: p(" <div>Good!</div>"); //line: 4
   79: } //line: 5
   80: p("\n</div>"); //line: 6
   81:
   82: 		return this;
   83: 	}
```