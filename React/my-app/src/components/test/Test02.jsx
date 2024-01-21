import { useEffect, useState } from "react";

function Test02() {
    const [count, setCount] = useState(0);
    const [number, setNum] = useState(0);

    useEffect(() => {
        console.log('hellow');
      setTimeout(() => {
        setCount((count) => count + 1);
      }, 1000);
    });
  
    return (
        <>
            <h1>I have rendered {count} times!</h1>
            <button onClick={()=>{setNum(number+1)}}>
                button {number}
            </button>
        </>
    );
}
export default Test02;