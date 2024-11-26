/**
 * @param {integer} init
 * @return { increment: Function, decrement: Function, reset: Function }
 */
var createCounter = function(init) {
    let actuel=init
    return{
        increment: function() {
            init++
            return init

        },
        decrement: function() {
            init--
            return init

        },
        reset: function() {
            init=actuel
            return init
        }
    }
};

/**
 * const counter = createCounter(5)
 * counter.increment(); // 6
 * counter.reset(); // 5
 * counter.decrement(); // 4
 */