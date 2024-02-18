import './style.css';

export default function BlinkingTestPage(){
    return (
        <div>
            <input type="checkbox" id="colorButton"/>
            <label for="colorButton" style={{border: 'solid'}}>Change Color</label>

            <div class="square"></div>
        </div>

    )
}