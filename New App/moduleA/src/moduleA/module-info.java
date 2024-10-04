module moduleA {
    exports moduleA;
    provides moduleA.MyServices with moduleA.MyServiceImpl;
    provides moduleA.MyServices1 with moduleA.MyServiceImpl;
}
