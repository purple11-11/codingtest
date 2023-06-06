function solution(numer1, denom1, numer2, denom2) {
    const numer = (numer1 * denom2) + (numer2 * denom1);
    const denom = denom1 * denom2;
    const getGCD = (a, b) => (b === 0? a: getGCD(b, a%b)); //getGCD(b, a%b)는 재귀
    const gcd = getGCD(numer, denom)
    return [numer/gcd, denom/gcd];
}