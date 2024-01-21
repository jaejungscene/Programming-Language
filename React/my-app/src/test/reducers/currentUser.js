const currentUser = (state = {}, action) => {
    switch(action.type){
        case "ADD_USER":
            return {...state, 
                [action.payload.id]:action.payload.password
            }
        case "LOG_OUT":
            delete state[action.payload.id];
            return {...state};
        default:
            return state
    }
}

export default currentUser;