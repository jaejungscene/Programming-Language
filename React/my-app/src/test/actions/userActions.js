const setUser = (userObj) => {
    return {
        type: "ADD_USER",
        payload: userObj
    }
}

const logOut = (userObj) => {
    return {
        type: "LOG_OUT",
        payload: userObj
    }
}

export default {
    setUser,
    logOut
}