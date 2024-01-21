import { useState } from "react";

function ExpandedList({ items, summary }) {
    const [isExpanded, setIsExpanded] = useState(false);

    const toggleExpansion = () => {
        setIsExpanded(!isExpanded);
    };

    return (
        <div>
        <div onClick={toggleExpansion} style={{ cursor: 'pointer' }}>
            {summary}
        </div>
            {isExpanded && (
                <ul>
                {items.map((item, index) => (
                    <li key={index}>{item}</li>
                ))}
                </ul>
            )}
        </div>
    );
};

export default ExpandedList;
