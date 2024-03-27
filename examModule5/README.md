Imtixon savollari:

1. Faylni Base64 yordamida encode qilib text faylga yozing.

2. Studentlar ro'yxati JSON strukturada faylga yozilgan, ularning o'rtacha yoshini stream API yordamida hisoblang.

3. Javada necha xil standart functional interfaceni bilasiz?

    ## Javoblar
Javadagi standart funksional interfeyslar ro`yxati:

1. `Function<T, R>`: Bitta argumentni oladigan va natijani qaytaruvchi funksiyani ifodalaydi.
2. `BiFunction<T, U, R>`: Ikki argumentni qabul qiluvchi va natijani qaytaruvchi funksiyani ifodalaydi.
3. `UnaryOperator<T>`: operand bilan bir xil turdagi natijani beradigan bitta operand ustidagi operatsiyani ifodalaydi.
4. `BinaryOperator<T>`: Operandlar bilan bir xil turdagi natijani chiqaradigan bir xil turdagi ikkita operand ustidagi operatsiyani ifodalaydi.
5. `Predicate<T>`: Bitta argumentning predikatini (mantiqiy funksiya) ifodalaydi.
6. `BiPredicate<T, U>`: Ikki argumentning predikatini (Mantiqiy funksiya) ifodalaydi.
7. `Consumer<T>`: Bitta kiritish argumentini qabul qiladigan va hech qanday natijani qaytarmaydigan operatsiyani ifodalaydi.
8. `BiConsumer<T, U>`: Ikki kiritish argumentini qabul qiladigan va hech qanday natijani qaytarmaydigan operatsiyani ifodalaydi.
9. `Supplier<T>`: Natijalarni yetkazib beruvchini ifodalaydi.

Bular Java’ning “java.util.function” paketi tomonidan taqdim etilgan to‘qqizta standart funksional interfeysdir. 
