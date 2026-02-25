function matrixTranspose(mat, n) {
    //Write your code here
    let fr = (fc = 0),
        lr = (lc = n);
    while (fr <= lr && lr <= lc) {
        for (let i = fc; i < lc; i++) {
            [mat[i][fr], mat[fr][i]] = [mat[fr][i], mat[i][fr]];
        }
        fr++;
        fc++;
    }
    return mat;
}
