import { useState, useEffect, useRef } from "react";
import ReactDOM from "react-dom/client";

function Test01() {
  const [inputValue, setInputValue] = useState("");
  const count = useRef(0);
  let rederCount = 0;

  useEffect(() => {
    console.log("hello world");
    count.current = count.current + 1;
    console.log("hello world123");
  });

  return (
    <>
      <input
        type="text"
        value={inputValue}
        onChange={(e) => {
          console.log(e.target.value);
          setInputValue(e.target.value + 'a');
        }}
      />
      <h1>Render Count: {count.current}, {rederCount}</h1>

    </>
  );
}

export default Test01;