/**
 * @param {Function[]} functions
 * @return {Function}
 */
var compose = function(functions) {
    
    return function(x) {
        let result=0
        let f = x
        if(functions===[]) return x
        for(let i=functions.length-1;i>=0;i--){
           f= functions[i](f)
        }
        return f
    }
};

/**
 * const fn = compose([x => x + 1, x => 2 * x])
 * fn(4) // 9
 */