import { useEffect, useState } from "react";
import { useDispatch, useSelector } from "react-redux"
import allActions from "./actions";

const ReduxTest = () => {
    // const counter = useSelector(state => state.counter)
    const counter = useSelector(state => state.counter)
    // const currentUser = useSelector(state => state.currentUser)
    const currentUser = useSelector(state => state.currentUser)
    const dispatch = useDispatch()

    // var user = {name: "Rei"}
    useEffect(() => {
        console.log('currentUser: ',currentUser);
    }, [currentUser]);


    const [formData, setFormData] = useState({
        id: '',
        password: '',
    });

    const handleChange = (e) => {
        const key = e.target.name;
        const value = e.target.value;
        console.log('>>>>', key, value);
        setFormData((prevData) => ({
          ...prevData,
          [key]: value,
        }));
      };
    

    // Handle form submission
    const handleSubmit = (e) => {
        e.preventDefault();
        // console.log('>>>>>>>>>>>>>>>>>>>> ', e.target.id.value);
        // console.log('>>>>>>>>>>>>>>>>>>>> ', e.target.password.value);
        // Access the submitted object (formData)
        console.log('Submitted Object:', formData);
        dispatch(allActions.userActions.setUser(formData));
        // You can send the formData to an API or perform other actions here
    };

    return (
        <div>
            hello world {formData.id}{formData.password}
            <form onSubmit={handleSubmit}>
            <label htmlFor="name">Id:</label>
            <input
                type="text"
                id="id"
                name="id"
                // value={formData.id}
                onChange={handleChange}
                required
            />

            <label htmlFor="email">password:</label>
            <input
                type="text"
                id="password"
                name="password"
                // value={formData.password}
                onChange={handleChange}
                required
            />

            <button type="submit">Submit</button>
            </form>
            <button onClick={()=>{
                console.log('Logout Object:', formData);
                dispatch(allActions.userActions.logOut(formData));
            }}>logout</button>



            <p>counter: {counter}</p>
            <button onClick={()=>{dispatch(allActions.counterActions.decrement())}}>
                Decrement
            </button>
            <button onClick={()=>{dispatch(allActions.counterActions.increment())}}>
                Increment
            </button>
        </div>
    )
}
export default ReduxTest;